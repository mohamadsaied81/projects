import { TestBed } from '@angular/core/testing';

import { VehicalservicedataService } from './vehicalservicedata.service';

describe('VehicalservicedataService', () => {
  let service: VehicalservicedataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VehicalservicedataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
