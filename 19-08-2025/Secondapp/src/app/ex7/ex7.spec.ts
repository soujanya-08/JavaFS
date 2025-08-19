import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex7 } from './ex7';

describe('Ex7', () => {
  let component: Ex7;
  let fixture: ComponentFixture<Ex7>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex7]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex7);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
