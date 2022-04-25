import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerShowComponent } from './customer-show.component';

describe('CustomerShowComponent', () => {
  let component: CustomerShowComponent;
  let fixture: ComponentFixture<CustomerShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomerShowComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
