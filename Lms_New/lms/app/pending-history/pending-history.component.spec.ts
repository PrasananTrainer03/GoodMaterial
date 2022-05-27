import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PendingHistoryComponent } from './pending-history.component';

describe('PendingHistoryComponent', () => {
  let component: PendingHistoryComponent;
  let fixture: ComponentFixture<PendingHistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PendingHistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PendingHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
