<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Add Holiday</title>

            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
                crossorigin="anonymous">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
                crossorigin="anonymous"></script>
            <script src="https://kit.fontawesome.com/a43228976e.js" crossorigin="anonymous"></script>

            <style>
                input,
                textarea,
                button {
                    padding: 8px 15px;
                    border-radius: 5px !important;
                    margin: 5px 0px;
                    box-sizing: border-box;
                    border: 1px solid #ccc;
                    font-size: 18px !important;
                    font-weight: 300
                }
            </style>
        </head>

        <body>
            <nav class="navbar navbar-expand-lg" style="background-color: rgba(0, 0, 0, 0.2);">
                <div class="container-fluid">

                    <div class="col-8">

                        <img src="/imges/LMS_Logo-removebg-preview.png" alt="" srcset="" class="ms-2"
                            style="width: 13%;">
                    </div>
                    <div class="collapse navbar-collapse ms-5 text-end">

                        <form class="d-flex ">
                            Welcome ${admin.name}
                        </form>
                        <div class="dropdown ms-4">
                            <a href="#"
                                class="d-flex  align-items-center text-dark text-decoration-none dropdown-toggle"
                                id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                                <img src="/imges/profilelogo.png" alt="hugenerd" width="30" height="30"
                                    class="rounded-circle">
                                <span class="d-none d-sm-inline mx-1">Profile</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
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
            <div class="container-fluid">
                <div class="row">
                    <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 " style="background-color: rgba(0, 0, 0, 0.2);">
                        <div
                            class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                            <a href="/"
                                class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                                <span class="fs-4 d-none d-sm-inline">Menu</span>
                            </a>
                            <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
                                id="menu">
                                <li>
                                    <a href="AdminDashboard?id=<c:out value="${admin.id }"/>" class="nav-link align-middle px-0">
                                        <i class="fa-solid fa-house"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Home</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="AdmiViewEmployee?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-users"></i> <span
                                            class="ms-1 d-none d-sm-inline text-dark">View
                                            Employees</span></a>
                                </li>

                                <li>
                                    <a href="AdminAddEmployee?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-user-plus"></i> <span
                                            class="ms-1 d-none d-sm-inline text-dark">Add Employee</span> </a>
                                </li>

                                <li>
                                    <a href="AdminManageLeave?id=<c:out value="${admin.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-calendar-days"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Manage Leave</span> </a>
                                </li>

                                <li>
                                    <a href="" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-mug-hot"></i> <span
                                            class="ms-2 d-none d-sm-inline text">Add
                                            Holiday</span></a>
                                </li>

                                <li>
                                    <a href="./AdminAddProject.html" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-folder-plus"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Add Project</span></a>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <div class="col-md-7 col-xl-9 col-8 mt-3 ">
                        <div class=" d-flex justify-content-center">

                            <div class="card mt-5 p-5 ms-5 shadow">
                                <h5 class="text-center mb-4">Add Holiday</h5>
                                <form class="form-card p-3" onsubmit="return check()">
                                    <div class="row justify-content-between text-left">

                                    </div>
                                    <div class="row justify-content-between text-left">

                                    </div>
                                    <!--From Date-->
                                    <div class="row justify-content-between text-left">
                                        <div class="form-group col-sm-6 flex-column d-flex"> <label
                                                class="form-control-label px-3">From Date<span class="text-danger">
                                                    *</span></label>
                                            <input type="date" id="from" name="fromDate" placeholder="">
                                            <span id="fromerror">

                                            </span>
                                        </div>
                                        <!--To Date-->
                                        <div class="form-group col-sm-6 flex-column d-flex"> <label
                                                class="form-control-label px-3">To Date<span class="text-danger">
                                                    *</span></label>
                                            <input type="date" id="to" name="toDate" placeholder="">
                                            <span id="toerror">

                                            </span>
                                        </div>
                                    </div>
                                    <div class="row justify-content-between text-left mt-3">
                                        <div class="form-group col-12 flex-column d-flex"> <label
                                                class="form-control-label px-3">Occassion<span class="text-danger">
                                                    *</span></label>
                                            <input type="text" id="ans" name="ans" placeholder="">
                                        </div>
                                    </div>
                                    <div class="row ">
                                        <div class="form-group mt-3"> <button type="submit"
                                                class="btn-block btn-primary w-50" onclick="check()">Add</button>
                                        </div>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <footer class="bg-light text-lg-start ">
                <div class=" p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                    © 2022 Copyright: Leave Management System By TEAM NO-4
                </div>
            </footer>


            <script>
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

                    $('#from').attr('min', minDate);
                });

            </script>
            <script>

                function check() {



                    var date1 = document.getElementById('from').value;
                    var date2 = document.getElementById('to').value;




                    if (date2 < date1 || date2 == "") {

                        document.getElementById('toerror').innerHTML = "*To Date should be greater than from"
                        document.getElementById('toerror').style.color = "red"
                        document.getElementById('to').focus()
                        return false;
                    }





                    else {
                        document.getElementById("fromerror").innerHTML = "";
                    }

                }

            </script>
        </body>

        </html>