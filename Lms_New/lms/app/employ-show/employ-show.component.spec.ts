import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployShowComponent } from './employ-show.component';

describe('EmployShowComponent', () => {
  let component: EmployShowComponent;
  let fixture: ComponentFixture<EmployShowComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployShowComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
