import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-search-comp',
  imports: [FormsModule],
  templateUrl: './search-comp.html',
  styleUrl: './search-comp.css'
})
export class SearchComp {
listBox:string[]=["Jayanta", "Jayaram","Abhi","Rajiv","Rashi","Veer"];
names:string="";
get filteredNames(): string[] {
    return this.listBox.filter(name =>
      name.toLowerCase().startsWith(this.names.toLowerCase())
    );
  }
}
