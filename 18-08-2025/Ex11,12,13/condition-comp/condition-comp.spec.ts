import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConditionComp } from './condition-comp';

describe('ConditionComp', () => {
  let component: ConditionComp;
  let fixture: ComponentFixture<ConditionComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ConditionComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConditionComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
