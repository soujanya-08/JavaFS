import { Component } from '@angular/core';
import { DisplayList } from '../display-list/display-list';
import { Ex5 } from '../ex5/ex5';
import { IFruit } from '../ifruit';
import { Ex6 } from '../ex6/ex6';
import { Ex7 } from '../ex7/ex7';

@Component({
  selector: 'app-home',
  imports: [DisplayList,Ex5, Ex6,Ex7],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
//From home component we pass the values
itemsList =[
  {imgsrc:"https://images.unsplash.com/photo-1526318472351-c75fcf070305?q=80&w=687&auto=format&fit=crop", name:"Pomogranate", desc:"1"},
  {imgsrc:"https://plus.unsplash.com/premium_photo-1674382739482-5d36b98d653a?q=80&w=627&auto=format&fit=crop", name:"Kiwi", desc:"2"},
  {imgsrc:"https://images.unsplash.com/photo-1571771894821-ce9b6c11b08e?q=80&w=880&auto=format&fit=crop", name:"Banana", desc:"3"},
  {imgsrc:"https://images.unsplash.com/photo-1546548970-71785318a17b?q=80&w=687&auto=format&fit=crop", name:"Lemons", desc:"4"},
  {imgsrc:"https://images.unsplash.com/photo-1477830530828-c849c4b9bf2d?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", name:"Apples", desc:"5"},
  {imgsrc:"https://plus.unsplash.com/premium_photo-1678469638470-e269e9b898b6?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", name:"Oranges", desc:"6"},
  {imgsrc:"https://images.unsplash.com/photo-1601004890684-d8cbf643f5f2?q=80&w=715&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", name:"Strawberry", desc:"7"},
]
fruitsList: IFruit[] = [
  {imgSrc:"https://images.unsplash.com/photo-1526318472351-c75fcf070305?q=80&w=687&auto=format&fit=crop", name:"Pomogranate", desc:"1"},
  {imgSrc:"https://plus.unsplash.com/premium_photo-1674382739482-5d36b98d653a?q=80&w=627&auto=format&fit=crop", name:"Kiwi", desc:"2"},
  {imgSrc:"https://images.unsplash.com/photo-1571771894821-ce9b6c11b08e?q=80&w=880&auto=format&fit=crop", name:"Banana", desc:"3"},
  {imgSrc:"https://images.unsplash.com/photo-1546548970-71785318a17b?q=80&w=687&auto=format&fit=crop", name:"Lemons", desc:"4"},
  {imgSrc:"https://images.unsplash.com/photo-1477830530828-c849c4b9bf2d?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", name:"Apples", desc:"5"},
  {imgSrc:"https://plus.unsplash.com/premium_photo-1678469638470-e269e9b898b6?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", name:"Oranges", desc:"6"},
  {imgSrc:"https://images.unsplash.com/photo-1601004890684-d8cbf643f5f2?q=80&w=715&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", name:"Strawberry", desc:"7"},
];

btnClick(name:string){
  this.fruitsList = this.fruitsList.filter(item => item.name !== name);
}
}
