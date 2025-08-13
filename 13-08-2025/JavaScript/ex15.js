
function addTask(){
    const task = document.getElementById("input-text").value;
    let taskList = document.getElementById("taskList");
    if (task === "") {
        alert("Please enter a task.");
        return;
    }
    const taskDiv = document.createElement("div");
    taskDiv.className="task-item";
    const taskSpan = document.createElement("span");
    taskSpan.textContent = task;
    const deleteBtn = document.createElement("button");
    deleteBtn.textContent ="Delete";
    deleteBtn.className = "delete-btn";
    deleteBtn.onclick = function(){
        taskDiv.remove();
    }
  taskDiv.appendChild(taskSpan);
  taskDiv.appendChild(deleteBtn);
  taskList.appendChild(taskDiv);
  document.getElementById("input-text").value = "";
}