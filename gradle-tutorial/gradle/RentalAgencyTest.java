= new RentalTransaction("item-1", "customer-1", 5, 100);
        agency.addTransaction(transaction);

        assertEquals(1, agency.getTransactions().size());
        assertTrue(agency.getTransactions().contains(transaction));
    }