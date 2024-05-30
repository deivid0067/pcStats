function navScroll () {
    const scroll = window.scrollY;
    if (scroll > 0) {
        document.querySelector('nav').classList.add("active")
        document.querySelector('#logo').src="./img/logoREd.png"
    } else {
        document.querySelector('nav').classList.remove("active")
        document.querySelector('#logo').src="./img/logoBranca.png"
    }
}

document.addEventListener('scroll', navScroll)