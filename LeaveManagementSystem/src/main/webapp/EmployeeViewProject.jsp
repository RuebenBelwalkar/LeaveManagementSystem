<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
             <link rel="stylesheet" href="/global.css">
            <title>View Project</title>

            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
                crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
                crossorigin="anonymous"></script>
            <script src="https://kit.fontawesome.com/a43228976e.js" crossorigin="anonymous"></script>
        </head>

        <body>
            <nav class="navbar navbar-expand-lg" style="background-color: rgba(0, 0, 0, 0.2);">
                <div class="container-fluid">

                    <div class="col-8">

                        <img src="./imges/LMS_Logo-removebg-preview.png" alt="" srcset="" class="ms-4"
                            style="width: 13%;">
                    </div>
                    <div class="collapse navbar-collapse ms-5 text-end">

                        <form class="d-flex ">
                            Welcome ${Employee.name}
                        </form>
                        <div class="dropdown ms-4">
                            <a href="#" class="d-flex align-items-center text-dark text-decoration-none dropdown-toggle"
                                id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                                <img src="./imges/profilelogo.png" alt="hugenerd" width="30" height="30"
                                    class="rounded-circle">
                                <span class="d-none d-sm-inline mx-1">Profile</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
                                <li><a class="dropdown-item" href="ResetPassword.html">Reset Password</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="">Sign out</a></li>
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
                                    <a href="EmployeeDashboard?id=<c:out value="${employee.id }"/>" class="nav-link align-middle px-0">
                                        <i class="fa-solid fa-house"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Home</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="EmployeeApplyLeave?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-regular fa-calendar-check"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Apply Leave</span></a>
                                </li>



                                <li>
                                    <a href="" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-binoculars"></i> <span
                                            class="ms-2 d-none d-sm-inline text-primary">View Project</span></a>
                                </li>

                                <li>
                                    <a href="EmployeeLeaveTracker?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-chart-gantt"></i>
                                        <span class="ms-2 d-none d-sm-inline text-dark">Leave Tracker</span></a>
                                </li>
                            </ul>
                            <hr>

                        </div>
                    </div>
                    <div class="col-md-7 col-xl-9 col-8 mt-3 ">
                        <div class="card-body ">

                            <form action="#" method="" class="row ms-5">
                                <!--Form Heading-->
                                <div class=" pt-3 mb-3">
                                    <h3>View Project</h3>
                                </div>

                                <div class="col-xl-6  col-md-6 col-12 mt-3 ">

                                    <label class="form-label fw-bold ">Project Name</label>
                                    <input type="text" name="name" value="${project.name}"
                                        class="form-control border-top-0 border-start-0 border-end-0 " readonly />
                                </div>

                                <div class="col-xl-6  col-md-6 col-12 mt-3 ">
                                    <label class="form-label fw-bold">Project End Date</label>
                                    <input type="date" class="form-control border-top-0 border-start-0 border-end-0"
                                        id="inputDate" name="date" readonly />
                                </div>

                                <div class="col-xl-6  col-md-6 col-12 mt-3">
                                    <label class="form-label fw-bold ">Project Manager</label>
                                    <input type="text" name="name" value="${manager.name}"
                                        class="form-control border-top-0 border-start-0 border-end-0" readonly />
                                </div>


                                <div class="form-group mt-3">
                                    <label class="form-label fw-bold">Project Description</label>
                                    <!-- <input type="text" class="form-control" id="inputName" name="name" value="${employee.name}"
                            readonly /> -->
                                    <textarea class="form-control border-top-0 border-start-0 border-end-0"
                                        id="inputName" name="name" id="" cols="30" rows="8" required></textarea>
                                </div>



                            </form>
                        </div>
                    </div>

                    <footer class="bg-light text-center text-lg-start ">
                        <div class="p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                            © 2022 Copyright: Leave Management System By TEAM NO-4
                        </div>
                    </footer>

        </body>

        </html>