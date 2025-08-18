import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchComp } from './search-comp';

describe('SearchComp', () => {
  let component: SearchComp;
  let fixture: ComponentFixture<SearchComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SearchComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
