<script type="text/javascript">
        function fade(step) {
            var imgs = document.getElementById("meinFader").getElementsByTagName("img");

            step = step || 0;

            imgs[counter].style.opacity = step/100;
            imgs[counter].style.filter = "alpha(opacity=" + step + ")"; // 

            step = step + 2;

            if (step <= 100) {
                window.setTimeout(function () { fade(step); }, 1);
            } else {
                window.setTimeout(next, 2000);
            }
        }

        function next() {
            var imgs = document.getElementById("meinFader").getElementsByTagName("img");

            if (typeof(counter) != "number") {
                counter = 0;
            }

            counter++;

            if (counter < imgs.length) {
                fade();
            }
        };
    </script>