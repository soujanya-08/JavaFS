import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListComp } from './list-comp';

describe('ListComp', () => {
  let component: ListComp;
  let fixture: ComponentFixture<ListComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
