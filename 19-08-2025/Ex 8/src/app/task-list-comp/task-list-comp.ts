import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ITask } from '../itask';
import { NgClass, NgStyle } from '@angular/common';

@Component({
  selector: 'app-task-list-comp',
  imports: [NgClass, NgStyle],
  templateUrl: './task-list-comp.html',
  styleUrl: './task-list-comp.css'
})
export class TaskListComp {
@Input() tasks: ITask[] = [];
@Output() deleteTask = new EventEmitter<number>();

  delete(id: number) {
    this.deleteTask.emit(id);
  }
}
