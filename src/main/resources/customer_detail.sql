-- Create customer_detail table if it doesn't exist
DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_tables WHERE tablename = 'customer_detail') THEN
        CREATE TABLE customer_detail (
            customer_id VARCHAR(10) PRIMARY KEY,
            customer_name VARCHAR(50) NOT NULL,
            address VARCHAR(50) NOT NULL,
            contact_no varchar(255) NOT NULL,
            city varchar(255) NOT NULL,
            gender varchar(10) NOT NULL
        );
    END IF;
END
$$
;

-- Clear existing data if any
TRUNCATE TABLE customer_detail;

-- Insert flight schedule data
INSERT INTO customer_detail (customer_id, customer_name, address, contact_no, city, gender) VALUES
('C001', 'Juned', 'A', '7742370677', 'Los Angeles', 'Male'),
('C002', 'Vaseem', 'B', '7742370678', 'New York', 'Male'),
('C003', 'Vinod', 'C', '7742370674', 'Los Angeles', 'Male'),
('C004', 'Divyanshu', 'D', '7742370673', 'Los Angeles', 'Male'),
('C005', 'Iram', 'E', '7742370672', 'Houston', 'Female'),
('C006', 'Pushpendra', 'F', '7742370671', 'Chicago', 'Male'),
('C007', 'Shirin', 'G', '7742370670', 'Phoenix', 'Female'),
('C008', 'Muskan', 'H', '7742370675', 'Chicago', 'Female'),
('C009', 'Mona', 'I', '77423706776', 'Houston', 'Female'),
('C010', 'Rozi', 'J', '7742370679', 'Phoenix', 'Female');

-- Verify data insertion
SELECT COUNT(*) as total_records FROM customer_detail;
