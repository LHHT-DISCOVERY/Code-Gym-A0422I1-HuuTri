let tempA = 0;
let tempB = 0;
let tempC = 0;
let tempD = 0;
let tempE = 0;

function changeImageA() {
    if (tempA == 0) {
        document.getElementById("fame-1").src = "anhB-1.jpg";
        tempA++;
    } else if (tempA == 1) {
        document.getElementById("fame-1").src = "anhC-1.jpg";
        tempA++;
    }
    else {
        document.getElementById("fame-1").src = "anhA-1.jpg";
        tempA = 0;

    }
}
function changeImageB() {
    if (tempB == 0) {
        document.getElementById("fame-2").src = "anhA-2.jpg";
        tempB++;
    } else if (tempB == 1) {
        document.getElementById("fame-2").src = "anhC-2.jpg";
        tempB++;
    }
    else {
        document.getElementById("fame-2").src = "anhB-2.jpg";
        tempB = 0;

    }
}
function changeImageC() {
    if (tempC == 0) {
        document.getElementById("fame-3").src = "anhA-3.jpg";
        tempC++;
    } else if (tempC == 1) {
        document.getElementById("fame-3").src = "anhB-3.jpg";
        tempC++;
    }
    else {
        document.getElementById("fame-3").src = "anhC-3.jpg";
        tempC = 0;

    }
}
function changeImageD() {
    if (tempD == 0) {
        document.getElementById("fame-4").src = "anhC-4.jpg";
        tempD++;
    } else if (tempD == 1) {
        document.getElementById("fame-4").src = "anhB-4.jpg";
        tempD++;
    }
    else {
        document.getElementById("fame-4").src = "anhA-4.jpg";
        tempD = 0;

    }
}
function changeImageE() {
    if (tempE == 0) {
        document.getElementById("fame-5").src = "anhA-5.jpg";
        tempE++;
    } else if (tempE == 1) {
        document.getElementById("fame-5").src = "anhB-5.jpg";
        tempE++;
    }
    else {
        document.getElementById("fame-5").src = "anhC-5.jpg";
        tempE = 0;

    }
}