import React, { useState } from 'react';

export default function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(`Amount: ${amount}, Currency: ${currency}`);
    // Conversion logic here
  };
   
}
