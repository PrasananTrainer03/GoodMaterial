package com.java.cons;

/*
Write a Program as Read Employ Details, and perform validations, as
Empno cannot be zero or negative
Name contains min 5 characters
basic must be between 20000 to 80000
 */
public class SbTest {

    public void show(Employ employ) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        if (employ.empno <= 0) {
            sb.append("Employ Number cannot be Zero or Negative...\r\n");
            flag = false;
        }
        if (employ.name.length() < 5) {
            sb.append("Employ Name contains min 5 characters...\r\n");
            flag = false;
        }
        if (employ.basic < 20000 || employ.basic > 80000) {
            sb.append("Employ Salary must be between 20000 and 80000...\r\n");
            flag = false;
        }
        if (flag==true) {
            System.out.println(employ);
        } else {
            System.err.println(sb);
        }
    }
    public static void main(String[] args) {
        Employ employ = new Employ(-1, "Abc",98443);
        SbTest obj = new SbTest();
        obj.show(employ);
    }
}
