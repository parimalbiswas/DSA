const wrapper = document.getElementById("wrapper");
const button = document.querySelector("#button");
const input = document.querySelector("#input");
const qr_code_img = document.querySelector("#qr_code_img");

button.addEventListener("click", () => {
    let value = input.value;
    if (!value) {
        return;
    }

    button.innerText = "Generating QR Code....";

    qr_code_img.src = `https://api.qrserver.com/v1/create-qr-code/?size=170x170&data=${value}`;
    qr_code_img.addEventListener("load", () => {
        wrapper.classList.add("active");
        button.innerText = "Generate QR Code";
    });

    // console.log(value);
    // wrapper.classList.add("active");

});