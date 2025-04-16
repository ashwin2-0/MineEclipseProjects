/**
 * 
 */

$(document).ready(function() {
    // Name validation
    $("#name").on("input", function() {
        const name = $(this).val();
        if (!name.match(/^[a-zA-Z\s]+$/)) {
            alert("Name can only contain letters and spaces.");
        }
    });

    // Experience validation
    $("#experience").on("input", function() {
        const experience = $(this).val();
        if (experience < 0 || experience > 50) {
            alert("Experience should be between 0 to 50 years.");
        }
    });

    // Skills validation
    $("#skills").on("input", function() {
        const skills = $(this).val();
        if (skills.trim() === "") {
            alert("Please enter at least one skill.");
        }
    });

    // Projects validation
    $("#projects").on("input", function() {
        const projects = $(this).val();
        const projectRegex = /^[a-zA-Z0-9\s]+:\d+$/;
        if (!projects.split(",").every(proj => proj.match(projectRegex))) {
            alert("Projects should be in the format 'ProjectName:Months'.");
        }
    });

    // Languages validation
    $("#languages").on("input", function() {
        const languages = $(this).val();
        if (languages.trim() === "") {
            alert("Please enter at least one language.");
        }
    });

    // Education validation
    $("#education").on("input", function() {
        const education = $(this).val();
        const educationRegex = /^[a-zA-Z\s]+:[a-zA-Z\s]+$/;
        if (!education.split(",").every(edu => edu.match(educationRegex))) {
            alert("Education should be in the format 'Degree:Institution'.");
        }
    });

    // Address validation
    $("#address").on("input", function() {
        const address = $(this).val();
        if (address.trim() === "") {
            alert("Address cannot be empty.");
        }
    });

    // Phone number validation
    $("#phone").on("input", function() {
        const phone = $(this).val();
        if (!phone.match(/^[0-9]{10}$/)) {
            alert("Phone number must be 10 digits.");
        }
    });

    // Email validation
    $("#email").on("input", function() {
        const email = $(this).val();
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!email.match(emailRegex)) {
            alert("Please enter a valid email.");
        }
    });
});