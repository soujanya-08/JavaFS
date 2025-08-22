import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PurchaseComp } from './purchase-comp';

describe('PurchaseComp', () => {
  let component: PurchaseComp;
  let fixture: ComponentFixture<PurchaseComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PurchaseComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PurchaseComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
