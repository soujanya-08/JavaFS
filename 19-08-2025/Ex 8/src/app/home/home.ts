import { Component } from '@angular/core';
import { ITask } from '../itask';
import { TaskListComp } from '../task-list-comp/task-list-comp';
import { TaskComp } from '../task-comp/task-comp';

@Component({
  selector: 'app-home',
  imports: [TaskListComp,TaskComp],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
tasks: ITask[] = [];
  private nextId = 1; 

  addTask(task:ITask){
    const newTask: ITask = {
       id: this.nextId++,
       description: task.description,
       category: task.category
     };
    this.tasks.push(newTask);
  }
  deleteTask(id: number) {
    this.tasks = this.tasks.filter(task => task.id !== id);
  }
}
