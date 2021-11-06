  function myFunction(myInput) {
      var parrafo=document.getElementById("parrafo");
                let input, filter, ul, li, a, i, txtValue;
                let inputvalue=document.getElementById("myInput").value;
                input = document.getElementById("myInput");
                filter = input.value.toUpperCase();
                ul = document.getElementById("myUL");
                li = ul.getElementsByTagName("li");
                for (i = 0; i < li.length; i++) {
                    a = li[i].getElementsByTagName("a")[0];
                    txtValue = a.textContent || a.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        li[i].style.display = "";
                        parrafo.style.display="none";
                    }
                    else {
                        li[i].style.display = "none";
                        parrafo.style.display="block";
                      
                        
                    }
                }
            }

