import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerDashBoardComponent } from './customer-dash-board.component';

describe('CustomerDashBoardComponent', () => {
  let component: CustomerDashBoardComponent;
  let fixture: ComponentFixture<CustomerDashBoardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomerDashBoardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerDashBoardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
