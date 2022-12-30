<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Managers Dashboard</title>

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

                        <img src="./imges/LMS_Logo-removebg-preview.png" alt="" srcset="" class="ms-1"
                            style="width: 13%;">
                    </div>
                    <div class="collapse navbar-collapse ms-5 text-end">

                        <form class="d-flex ">
                            Welcome ${employee.name}
                        </form>
                        <div class="dropdown ms-4">
                            <a href="#" class="d-flex align-items-center text-dark text-decoration-none dropdown-toggle"
                                id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                                <img src="./imges/profilelogo.png" alt="hugenerd" width="30" height="30"
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
                                    <a href="" class="nav-link align-middle px-0">
                                        <i class="fa-solid fa-house"></i> <span
                                            class="ms-2 d-none d-sm-inline text-primary">Home</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="ManagerApplyLeave?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-regular fa-calendar-check"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Apply Leave</span></a>
                                </li>


                                <li>
                                    <a href="ManagerViewEmployee?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-users"></i> <span
                                            class="ms-1 d-none d-sm-inline text-dark">View
                                            Employees</span></a>
                                </li>


                                <li>
                                    <a href="ManagerManageLeave?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-calendar-days"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">Manage Leave</span> </a>
                                </li>

                                <li>
                                    <a href="ManagerViewProject?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                        <i class="fa-solid fa-binoculars"></i> <span
                                            class="ms-2 d-none d-sm-inline text-dark">View Project</span></a>
                                </li>
                            <li>
                            <a href="ManagerLeaveTracker?id=<c:out value="${employee.id }"/>" class="nav-link px-0 mt-2 align-middle">
                                <i class="fa-solid fa-chart-gantt"></i>
                                <span class="ms-2 d-none d-sm-inline text-dark">Leave Tracker</span></a>
                        </li>
                            </ul>
                            <hr>

                        </div>
                    </div>
                    <div class="col py-2">

                        <div class="container rounded bg-white mt-5 mb-5">
                            <div class="row">
                                <div class="col-md-4 border-right">
                                    <div class="d-flex flex-column align-items-center text-center p-3 py-4">
                                        <img class="rounded-circle m-5" width="250px" src="./imges/profile2.jpeg"><span
                                            class="font-weight-bold">${employee.designation}</span><span
                                            class="text-black-100">${employee.email}</span><span></span>
                                    </div>
                                </div>
                                <div class="col-md-7">
                                    <div class="p-3 py-3">
                                        <div class="d-flex justify-content-between align-items-center mb-5">
                                            <h4 style="color: #554949; font-weight: 500; ">My Profile</h4>
                                        </div>
                                        <div class="col-md-12 col-12 mb-4">
                                            <label for="Name" style="color: #a4a4a4; font-weight: 500;">Name :</label>
                                            <span class="ms-3">${employee.name}</span>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-md-6 col-12 mb-4">
                                                <label for="Id" style="color: #a4a4a4; font-weight: 500;">ID :</label>
                                                <span class="ms-5">${employee.id}</span>
                                            </div>
                                            <div class="col-md-6 col-12 mb-4">
                                                <label for="username" style="color: #a4a4a4; font-weight: 500;">Username
                                                    :</label>
                                                <span class="">${employee.username}</span>
                                            </div>
                                            <div class="col-md-6 col-12 mb-4">
                                                <label for="gender" style="color: #a4a4a4; font-weight: 500;">Gender
                                                    :</label>
                                                <span class="ms-3">${employee.gender}</span>
                                            </div>
                                            <div class="col-md-6 col-12 mb-4">
                                                <label for="dob" style="color: #a4a4a4; font-weight: 500;">DOB :</label>
                                                <span class="ms-4"> ${employee.dob}</span>
                                            </div>
                                            <div class="col-md-6 mb-3">
                                                <label for="mobile" style="color: #a4a4a4; font-weight: 500;">Mobile
                                                    :</label>
                                                <span class="ms-2">${employee.mobileNumber}</span>
                                            </div>
                                            <div class="col-md-6 mb-4">
                                                <label for="email" style="color: #a4a4a4; font-weight: 500;">Email
                                                    :</label>
                                                <span class="ms-2">${employee.email}</span>
                                            </div>
                                            <div class="col-md-12 mb-4">
                                                <label for="address" style="color: #a4a4a4; font-weight: 500;">Address
                                                    :</label>
                                                <span class="ms-3">${employee.address}</span>
                                            </div>

                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </div>

            <footer class="bg-light text-center text-lg-start ">
                <div class="p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                    © 2022 Copyright: Leave Management System By TEAM NO-4
                </div>
            </footer>

        </body>

        </html>