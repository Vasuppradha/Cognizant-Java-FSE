import React, { Component } from 'react';

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fullName: '',
      email: '',
      password: '',
      errors: {
        fullName: '',
        email: '',
        password: ''
      }
    };
  }

  handleChange = (event) => {
    const { name, value } = event.target;
    let errors = this.state.errors;

    switch (name) {
      case 'fullName':
        errors.fullName = value.length < 5 ? 'Full Name must be 5 characters long!' : '';
        break;
      case 'email':
        const validEmailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        errors.email = validEmailRegex.test(value) ? '' : 'Email is not valid!';
        break;
      case 'password':
        errors.password = value.length < 8 ? 'Password must be at least 8 characters long!' : '';
        break;
      default:
        break;
    }

    this.setState({ errors, [name]: value });
  };

  validateForm = (errors) => {
    return Object.values(errors).every(err => err === '');
  };

  handleSubmit = (event) => {
    event.preventDefault();
    if (this.validateForm(this.state.errors)) {
      alert('Valid Form');
    } else {
      if (this.state.errors.fullName !== '') alert(this.state.errors.fullName);
      if (this.state.errors.email !== '') alert(this.state.errors.email);
      if (this.state.errors.password !== '') alert(this.state.errors.password);
    }
  };

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h2 style={{ color: 'green' }}>Mail Registration Form</h2>
        <form onSubmit={this.handleSubmit}>
          <div>
            <input
              type="text"
              name="fullName"
              placeholder="Enter Full Name"
              value={this.state.fullName}
              onChange={this.handleChange}
              style={{ width: '300px', padding: '10px', marginBottom: '10px' }}
            />
          </div>
          <div>
            <input
              type="email"
              name="email"
              placeholder="Enter Email"
              value={this.state.email}
              onChange={this.handleChange}
              style={{ width: '300px', padding: '10px', marginBottom: '10px' }}
            />
          </div>
          <div>
            <input
              type="password"
              name="password"
              placeholder="Enter Password"
              value={this.state.password}
              onChange={this.handleChange}
              style={{ width: '300px', padding: '10px', marginBottom: '10px' }}
            />
          </div>
          <button type="submit" style={{ padding: '10px 20px' }}>Register</button>
        </form>
      </div>
    );
  }
}

export default Register;