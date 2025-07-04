const ham = document.querySelector('#hamburger');
const links = document.querySelector('ul.right');

ham.onclick = function(){
  if(ham.className === 'fa-solid fa-bars'){
    ham.className = 'fa-solid fa-xmark';
    links.style.display = 'block';

  }
  else{
    ham.textContent = 'Menu';
    links.style.display = 'none';

  }

}