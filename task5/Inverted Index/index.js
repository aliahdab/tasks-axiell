"use strict"
const stopWordList = ['he', 'she', 'a', 'and', 'for', 'of', 'me', 'about', 'if', 'even', 'though', 'one', 'any', 'mr', 'was', 'is', 'where', 'when', 'from', 'the', 'just', 'you'];
window.onload = function () {
  const fileInput = document.getElementById('fileInput');
  const fileDisplayArea = document.getElementById('fileDisplayArea');

  const myMap = new Map();

  fileInput.addEventListener('change', function (e) {
    const dataFiles = fileInput.files;
    const filesArray = Array.from(dataFiles);
    const textType = /text.*/;
    filesArray.forEach((file) => {
      if (file.type.match(textType)) {
        const reader = new FileReader();
        reader.onload = function (e) {
          // fileDisplayArea.innerText = reader.result;
          const s = reader.result.toLowerCase();
          const res = s.split(" ").filter((word) => (!stopWordList.includes(word)));
          res.forEach(
            (item) => {
              const arrayFileNumbers = [filesArray.length];
              if (myMap.has(item)) {
                const temp = myMap.get(item);
                temp[filesArray.indexOf(file)] = true;
                myMap.set(item, temp);
              } else {
                arrayFileNumbers[filesArray.indexOf(file)] = true;
                myMap.set(item, arrayFileNumbers);
              }
            });
        }
        reader.readAsText(file);
      } else {
        fileDisplayArea.innerText = "File not supported!"
      }
    }
    )
    console.log(myMap.entries());
  });
}

