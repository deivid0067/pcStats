const inputs = document.querySelectorAll('.input');
const button = document.querySelector('.login_button')

const handleFocus = (e) => {
    const span = e.target.previousElementSibling;
    span.classList.add("active")
}

const handleFocusOut = (e) => {
    if (e.target.value === '') {
        const span = e.target.previousElementSibling;
        span.classList.remove("active")
    }
}

inputs.forEach((input) => {
    input.addEventListener('focus', handleFocus);
    input.addEventListener('blur', handleFocusOut);
});

