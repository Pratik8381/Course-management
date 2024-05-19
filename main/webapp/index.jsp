<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Course Management App</title>
  <style>
      body {
          margin: 0;
          padding: 0;
          font-family: Arial, sans-serif;
      }

      .background {
          position: fixed;
          top: 0;
          left: 0;
          width: 100%;
          height: 100%;
          background-image: url('background-image.jpg'); /* Replace 'background-image.jpg' with your actual image file */
          background-size: cover;
          background-position: center;
          z-index: -1;
          opacity: 0.5; /* Adjust the opacity as needed */
      }

      .content {
          position: relative;
          z-index: 1;
          padding: 20px;
      }

      h2 {
          text-align: center;
          color: #333;
      }

      ol {
          list-style-type: none;
          margin: 0;
          padding: 0;
          text-align: center;
      }

      li {
          margin: 10px 0;
      }

      a {
          display: inline-block;
          padding: 10px 20px;
          background-color: #4CAF50;
          color: white;
          text-decoration: none;
          border-radius: 5px;
          transition: background-color 0.3s ease;
      }

      a:hover {
          background-color: #45a049;
      }

  </style>
</head>
<body>
<div class="background"></div>
<div class="content">
    <h2>Course Management App</h2>
    <ol>
        <li>
            <a href="Add-Course.html">Add Course</a>
        </li>
        <li>
            <a href="delete-Course.html">Delete Course</a>
        </li>
        <li>
            <a href="update-Course.html">Update Course</a>
        </li>
        <li>
            <a href="Print-all.html">Show Course</a>
        </li>
    </ol>
</div>
</body>
</html>
