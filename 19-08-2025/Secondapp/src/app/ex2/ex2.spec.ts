import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2 } from './ex2';

describe('Ex2', () => {
  let component: Ex2;
  let fixture: ComponentFixture<Ex2>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
