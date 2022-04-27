import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcceptRejectOrderComponent } from './accept-reject-order.component';

describe('AcceptRejectOrderComponent', () => {
  let component: AcceptRejectOrderComponent;
  let fixture: ComponentFixture<AcceptRejectOrderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcceptRejectOrderComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AcceptRejectOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
