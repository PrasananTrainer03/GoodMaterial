import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorDashBoardComponent } from './vendor-dash-board.component';

describe('VendorDashBoardComponent', () => {
  let component: VendorDashBoardComponent;
  let fixture: ComponentFixture<VendorDashBoardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorDashBoardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorDashBoardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
