import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskListComp } from './task-list-comp';

describe('TaskListComp', () => {
  let component: TaskListComp;
  let fixture: ComponentFixture<TaskListComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TaskListComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TaskListComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
