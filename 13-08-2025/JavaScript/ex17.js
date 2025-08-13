
const quizData = [
    {
        question: "Which of the following statements about the Object class in Java is true?",
        options: ["Every Java class extends Object class either directly or indirectly.",
             "Only classes without a superclass extend Object class.",
              "The Object class cannot be extended.",
               "Object class is an abstract class."],
        answer: "1"
    },
    {
        question: "Which keyword is used to create a subclass in Java?",
        options: ["implements", "Inherits", "extends", "interface"],
        answer: "3"
    },
    {
        question: "Which keyword is used to refer to the immediate parent class in Java?",
        options: ["this", "super", "extends", "parent"],
        answer: "2"
    }
];
let currentQuestion = 0;
let score = 0;
let answered = false;

function loadQuestion() {
    const q = quizData[currentQuestion];
    document.getElementById("question").textContent = q.question;

    const optionsDiv = document.getElementById("options");
    optionsDiv.innerHTML = "";

    q.options.forEach((option, index) => {
        const btn = document.createElement("button");
        btn.textContent = option;
        btn.onclick = () => checkAnswer(index + 1);
        optionsDiv.appendChild(btn);
    });

    document.getElementById("feedback").textContent = "";
   // document.getElementById("score").textContent = `Score: ${score}`;
    answered = false;
}

function checkAnswer(selectedIndex) {
    if (answered) return;
    answered = true;

    const correctIndex = parseInt(quizData[currentQuestion].answer);
    const feedback = document.getElementById("feedback");

    if (selectedIndex === correctIndex) {
        feedback.textContent = "Correct!";
        feedback.style.color = "green";
        score++;
    } else {
        const correctText = quizData[currentQuestion].options[correctIndex - 1];
        feedback.textContent = `Wrong! Correct answer: ${correctText}`;
        feedback.style.color = "red";
    }

   // document.getElementById("score").textContent = `Score: ${score}`;
}

function nextQuestion() {
    currentQuestion++;
    if (currentQuestion < quizData.length) {
        loadQuestion();
    } else {
        document.getElementById("question").textContent = "Quiz Completed!";
        document.getElementById("options").innerHTML = "";
        document.getElementById("feedback").textContent = `Your final score: ${score}/${quizData.length}`;
    }
}

loadQuestion();