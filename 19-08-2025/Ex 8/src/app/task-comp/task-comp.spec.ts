import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskComp } from './task-comp';

describe('TaskComp', () => {
  let component: TaskComp;
  let fixture: ComponentFixture<TaskComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TaskComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TaskComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
