import { TestBed } from '@angular/core/testing';

import { FlightSearchService } from './flight-search';

describe('FlightSearch', () => {
  let service: FlightSearchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FlightSearchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
