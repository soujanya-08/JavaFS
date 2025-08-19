import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex6 } from './ex6';

describe('Ex6', () => {
  let component: Ex6;
  let fixture: ComponentFixture<Ex6>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex6]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex6);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
