import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProceedToPay } from './proceed-to-pay';

describe('ProceedToPay', () => {
  let component: ProceedToPay;
  let fixture: ComponentFixture<ProceedToPay>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProceedToPay]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProceedToPay);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
