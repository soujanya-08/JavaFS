class Stack<T>{
    private items:T[] =[]
    push(item:T):void{
        this.items.push(item);
    }
    pop():T|undefined{
        return this.items.pop();
    }
    peek():T|undefined{
        return this.items[this.items.length - 1]
    }
}
const numberStack = new Stack<number>();
numberStack.push(10);
numberStack.push(20);
console.log("Peek:", numberStack.peek()); 
console.log("Pop:", numberStack.pop());   
console.log("Peek after pop:", numberStack.peek());

const stringStack = new Stack<string>();
stringStack.push("Haapy");
stringStack.push("Sunday");
console.log("Peek:", stringStack.peek());
console.log(stringStack); 