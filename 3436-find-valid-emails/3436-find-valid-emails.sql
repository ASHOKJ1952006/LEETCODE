SELECT user_id, email
FROM users
WHERE email REGEXP '^[A-Za-z0-9_]+@[A-Za-z]+\\.com$'
ORDER BY user_id ASC;
 
--  ^                 → start of string
-- [A-Za-z0-9_]+     → username (letters, digits, underscore)
-- @                 → literal @
-- [A-Za-z]+         → domain name (letters only)
-- \\.com            → literal ".com"
-- $                 → end of string
