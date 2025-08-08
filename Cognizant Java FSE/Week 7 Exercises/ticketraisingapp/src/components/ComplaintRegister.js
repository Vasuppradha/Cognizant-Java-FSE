import React, { Component } from 'react';

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);
    this.state = {
      ename: '',
      complaint: '',
      numberHolder: Math.floor(100 + Math.random() * 900) // Random 3-digit ID
    };
  }

  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const msg = `Thanks ${this.state.ename}\nYour Complaint was Submitted...\nTransaction ID is: ${this.state.numberHolder}`;
    alert(msg);
  };

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h2 style={{ color: 'red' }}>Register your complaints here!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <div>
            <input
              type="text"
              name="ename"
              placeholder="Enter your name"
              value={this.state.ename}
              onChange={this.handleChange}
              style={{ width: '300px', padding: '10px', marginBottom: '10px' }}
            />
          </div>
          <div>
            <textarea
              name="complaint"
              placeholder="Enter your complaint"
              value={this.state.complaint}
              onChange={this.handleChange}
              rows="4"
              cols="50"
              style={{ padding: '10px', marginBottom: '10px' }}
            />
          </div>
          <button type="submit" style={{ padding: '10px 20px' }}>Submit</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;