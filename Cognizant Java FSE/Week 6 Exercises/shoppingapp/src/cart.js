import React from 'react';

export class Cart extends React.Component {
  render() {
    return (
      <table border="1" style={{ textAlign: 'center' }}>
        <thead>
          <tr>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {
            this.props.item.map((item, index) => (
              <tr key={index}>
                <td>{item.itemname}</td>
                <td>{item.price}</td>
              </tr>
            ))
          }
        </tbody>
      </table>
    );
  }
}
