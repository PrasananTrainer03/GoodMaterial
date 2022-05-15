import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployShowAllComponent } from './employ-show-all.component';

describe('EmployShowAllComponent', () => {
  let component: EmployShowAllComponent;
  let fixture: ComponentFixture<EmployShowAllComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployShowAllComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployShowAllComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
