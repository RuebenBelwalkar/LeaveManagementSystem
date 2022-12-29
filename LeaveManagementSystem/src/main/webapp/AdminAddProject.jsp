<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!doctype html>
        <html lang="en">

        <head>
            <!-- Required meta tags -->
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">

            <!-- Bootstrap CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
                crossorigin="anonymous">
            <script src="https://kit.fontawesome.com/a43228976e.js" crossorigin="anonymous"></script>
            <title>Leave Application</title>
        </head>

        <body>

            <nav class="navbar navbar-expand-lg" style="background-color: rgba(0, 0, 0, 0.2);">
                <div class="container-fluid">

                    <div class="col-8">

                        <img src="./imges/LMS_Logo-removebg-preview.png" alt="" srcset="" class="ms-1"
                            style="width: 13%;">
                    </div>
                    <div class="collapse navbar-collapse ms-5 text-end">

                        <form class="d-flex ">
                            Welcome ${admin.name}
                        </form>
                        <div class="dropdown ms-4">
                            <a href="" class="d-flex align-items-center text-dark text-decoration-none dropdown-toggle"
                                id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                                <img src="./imges/profilelogo.png" alt="hugenerd" width="30" height="30"
                                    class="rounded-circle">
                                <span class="d-none d-sm-inline mx-1">Profile</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark text-small mb-0 shadow">
                                <li><a class="dropdown-item" href="./ResetPassword.html">Reset Password</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="#">Sign out</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
            <!--Side Bar-->
            <div class="row">
                <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 ms-2" style="background-color: rgba(0, 0, 0, 0.2);">
                    <div
                        class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                        <a href="/"
                            class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                            <span class="fs-4 d-none d-sm-inline">Menu</span>
                        </a>
                        <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
                            id="menu">
                            <li>
                                <a href="AdminDashboard?id=<c:out value="${admin.id }"/>" class="nav-link align-middle px-0 pe-3  ">
                                    <i class="fa-solid fa-house"></i> <span
                                        class="ms-2 d-none d-sm-inline text-dark">Home</span>
                                </a>
                            </li>

                            <li>
                                <a href="AdminViewEmployee?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                    <i class="fa-solid fa-users"></i> <span
                                        class="ms-1 d-none d-sm-inline text-dark">View
                                        Employees</span></a>
                            </li>


                            <li>
                                <a href="AdminAddEmployee?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                    <i class="fa-solid fa-user-plus"></i> <span
                                        class="ms-1 d-none d-sm-inline text-dark">Add
                                        Employee</span> </a>
                            </li>

                            <li>
                                <a href="AdminManageLeave?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                    <i class="fa-solid fa-calendar-days"></i> <span
                                        class="ms-2 d-none d-sm-inline text-dark">Manage Leave</span> </a>
                            </li>

                            <li>
                                <a href="AdminAddHoliday?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                    <i class="fa-solid fa-mug-hot"></i> <span
                                        class="ms-2 d-none d-sm-inline text-dark">Add
                                        Holiday</span></a>
                            </li>

                            <li>
                                <a href="" class="nav-link px-0 mt-2 align-middle">
                                    <i class="fa-solid fa-folder-plus"></i> <span
                                        class="ms-2 d-none d-sm-inline text-primary">Add
                                        Project</span></a>
                            </li>
                        </ul>
                        <hr>

                    </div>
                </div>


                <!--Side Bar End-->

                <!-- Start Card -->
                <div class="ms-5 col-7 col-md-6 col-xl-7 mt-4 ">
                    <div class="card p-1 mt-5 ms-5 ">
                        <!-- Start Card Body -->
                        <div class="card-body ms-2">
                            <!-- Start Form -->
                            <form id="bookingForm" action="#" method="" onsubmit="return validate()">
                                <!--Form Heading-->
                                <div class="">
                                    <h2>Add Project</h2>
                                </div>
                                <!--Project Heading-->
                                <div class="form-group mt-5">
                                    <label class="form-label fw-bold">Project Name</label>
                                    <input type="text" class="form-control border-top-0 border-start-0 border-end-0"
                                        id="pname" name="projectHeading" />
                                    <span id="pnameerror">

                                    </span>

                                </div>
                                <!-- Project Desciption -->
                                <div class="form-group mt-3">
                                    <label class="form-label fw-bold">Project Description</label>
                                    <!-- <input type="text" class="form-control" id="inputName" name="name" value="${employee.name}"
                            readonly /> -->
                                    <textarea class="form-control border-top-0 border-start-0 border-end-0"
                                        id="inputName" name="name" id="pdesc" cols="30" rows="5" required></textarea>
                                </div>
                                <span id="descerror">

                                </span>
                                <!-- Department -->
                                <div class="row mt-3">


                                    <div class="form-group col-md-6 mt-2">
                                        <label class="form-label fw-bold">Department</label>
                                        <div class="d-flex flex-row justify-content-between align-items-center">
                                            <select class="form-select border-top-0 border-start-0 border-end-0 "
                                                id="inputStartTimeHour" name="department" required>
                                                <option value="" disabled selected>Choose Department</option>
                                                <option value="08">IT</option>
                                                <option value="09">Finance</option>
                                                <option value="10">HR</option>
                                            </select>

                                        </div>
                                    </div>

                                    <div class="form-group col-md-6 mt-2">
                                        <label class="form-label fw-bold">Manager Name</label>
                                        <div class="d-flex flex-row justify-content-between align-items-center">
                                            <select class="form-select border-top-0 border-start-0 border-end-0 "
                                                id="inputStartTimeHour" name="department" required>
                                                <option value="" disabled selected>Choose Manager</option>
                                                <option value="08">IT</option>
                                                <option value="09">Finance</option>
                                                <option value="10">HR</option>
                                            </select>

                                        </div>
                                    </div>

                                </div>
                                <!-- DeadLine -->
                                <div class="form-group col-md-6 mt-2">
                                    <label class="form-label fw-bold">DeadLine</label>
                                    <input type="date"
                                        class="form-control border-top-0 border-start-0 border-end-0 border-bottom-1"
                                        id="d1" name="date" required />
                                </div>
                                <!--  Submit Button -->
                                <div class="text-center">
                                    <button class="btn btn-primary btn-block col-lg-3 col-3 mt-5 mb-3 text-center"
                                        type="submit">Submit</button>
                                </div>


                            </form>
                            <!-- End Form -->
                        </div>
                        <!-- End Card Body -->
                    </div>
                </div>
                <!-- End Card -->
                <footer class="bg-light text-lg-start ">
                    <div class=" p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                        © 2022 Copyright: Leave Management System By TEAM NO-4
                    </div>
                </footer>

                <!-- Optional JavaScript -->
                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
                    integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
                    crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
                    crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
                    integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
                    crossorigin="anonymous"></script>

                <!-- Start Scritp for Form -->


                <script>
                    var name;
                    var desc;

                    function validate() {
                        this.name = document.getElementById('pname').value

                        if (this.name == "") {
                            document.getElementById('pnameerror').innerHTML = "*Enter Project name"
                            document.getElementById('pnameerror').style.color = "red"
                            document.getElementById('pname').focus()
                            return false;
                        }
                        else {
                            this.regex = /^[A-Za-z. ]{3,10}$/
                            if (!this.regex.test(name)) {
                                document.getElementById('pnameerror').innerHTML = "*Enter valid Project name"
                                document.getElementById('pnameerror').style.color = "red"
                                document.getElementById('pname').focus()
                                return false;
                            }
                            else {
                                document.getElementById('pnameerror').innerHTML = ""
                            }

                        }

                    }
                    $(function () {
                        var dtToday = new Date();

                        var month = dtToday.getMonth() + 1;
                        var day = dtToday.getDate();
                        var year = dtToday.getFullYear();
                        if (month < 10)
                            month = '0' + month.toString();
                        if (day < 10)
                            day = '0' + day.toString();

                        var minDate = year + '-' + month + '-' + day;

                        $('#d1').attr('min', minDate);
                    });

                </script>
                <!-- End Scritp for Form -->
                <!--Footer-->


        </body>

        </html>