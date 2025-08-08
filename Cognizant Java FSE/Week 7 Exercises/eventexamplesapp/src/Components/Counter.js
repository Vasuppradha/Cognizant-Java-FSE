import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  const increment = () => {
    setCount(count + 1);
    sayHello(); // Multiple method call
  };

  const decrement = () => setCount(count - 1);
  const sayHello = () => console.log("Hello from Increment!");
  const sayWelcome = (msg) => alert(msg);
  const clickMe = () => alert("I was clicked");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === "euro") {
      const conversionRate = 80; // Example: 1 Euro = 80 INR
      const convertedAmount = amount * conversionRate;
      alert(`Converting to Euro Amount is ${convertedAmount}`);
    } else {
      alert(`Amount: ${amount}, Currency: ${currency}`);
    }
  };

  return (
    <div style={{ margin: "20px" }}>
      {/* Counter Value */}
      <p>{count}</p>

      {/* Buttons */}
      <div>
        <button
            onClick={() => {
                alert("Hello member");
                increment();
            }}>
            Increment
        </button>
        <br />
        <button onClick={decrement}>Decrement</button>
        <br />
        <button onClick={() => sayWelcome("Welcome")}>Say welcome</button>
        <br />
        <button onClick={clickMe}>Click on me</button>
    </div>

      {/* Currency Convertor Heading */}
      <h2 style={{ color: "green" }}>
        <b>Currency Convertor!!!</b>
      </h2>

      {/* Form */}
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount:</label>
          <br />
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency:</label>
          <br />
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default Counter;
