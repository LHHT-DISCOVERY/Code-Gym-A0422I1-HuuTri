function Myfunction(value) {
    var good = document.getElementById('good');
    var fast = document.getElementById('fast');
    var cheap = document.getElementById('cheap');
    switch (value) {
        case "good":
            if (cheap.checked === true) {
                fast.checked = false;
            }
            break;
        case "fast":
            if (good.checked === true) {
                cheap.checked = false;
            }
            break;
        case "cheap":
            if (fast.checked === true) {
                good.checked = false;
            }
            break;
    }
}