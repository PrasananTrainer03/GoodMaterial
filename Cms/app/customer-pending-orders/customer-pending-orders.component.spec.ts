import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerPendingOrdersComponent } from './customer-pending-orders.component';

describe('CustomerPendingOrdersComponent', () => {
  let component: CustomerPendingOrdersComponent;
  let fixture: ComponentFixture<CustomerPendingOrdersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomerPendingOrdersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerPendingOrdersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
