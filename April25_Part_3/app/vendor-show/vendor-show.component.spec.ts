import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorShowComponent } from './vendor-show.component';

describe('VendorShowComponent', () => {
  let component: VendorShowComponent;
  let fixture: ComponentFixture<VendorShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorShowComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
