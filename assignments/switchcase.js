function go(){
  let score = document.querySelector("#input").value;

  score = Number(score);
  console.log(score);
  
  switch(Math.floor(score / 10)){
    case 10:
    case 9: 
    case 8:
    case 7:
      console.log("Grade A");
      break;
    case 6:
      console.log("Grade B");
      break;
    case 5:
      console.log("Grade C");
      break;
    case 4:
    case 3:
    case 2:
    case 1:
      console.log("Grade F");
      break;
    default:
      console.log("Ask the school for a refund");
  }
}