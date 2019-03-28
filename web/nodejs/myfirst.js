var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
        user: 'dmitry.bilyk@gmail.com',
        pass: 'password - replace user and pass with your user and pass'
    }
});

var mailOptions = {
    from: 'dmitry.bilyk@gmail.com',
    to: 'dmitry.bilyk@gmail.com',
    subject: 'Sending Email using Node.js',
    text: 'That was easy!'
};

transporter.sendMail(mailOptions, function(error, info){
    if (error) {
        console.log(error);
    } else {
        console.log('Email sent: ' + info.response);
    }
});