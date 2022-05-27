import { TestBed } from '@angular/core/testing';

import { EmployService } from './employ.service';

describe('EmployService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmployService = TestBed.get(EmployService);
    expect(service).toBeTruthy();
  });
});
