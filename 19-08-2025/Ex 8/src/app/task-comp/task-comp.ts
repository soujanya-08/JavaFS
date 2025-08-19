import { NgClass } from '@angular/common';
import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { ITask } from '../itask';

@Component({
  selector: 'app-task-comp',
  imports: [FormsModule, NgClass],
  templateUrl: './task-comp.html',
  styleUrl: './task-comp.css'
})
export class TaskComp {
   task: ITask = {
    id: 0,
    description: '',
    category: 'Work'
  };
@Output() addTask = new EventEmitter<ITask>();
onAdd(){
  if(this.task.description.trim()){
    this.addTask.emit(this.task);
    this.task.description = '';
    this.task.category = 'Work';
  }
  else{
    alert(`Enter the description`);
  }
}
}
